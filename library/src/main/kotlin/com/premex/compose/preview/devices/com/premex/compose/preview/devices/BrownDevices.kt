package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * brown device specifications for Android Compose previews.
 *
 * This extension provides brown device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Brown.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Brown: Any
  get() = object {
      /** DeviceSpec(manufacturer=brown, code=brown_tab1, width=1536, height=2048, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=brown, code=brown_tab1, width=1536,
      height=2048, dpi=320, isGoogleDevice=false).code */
      val BROWN_TAB1 = "spec:width=1536,height=2048,unit=px,dpi=320"

  }
