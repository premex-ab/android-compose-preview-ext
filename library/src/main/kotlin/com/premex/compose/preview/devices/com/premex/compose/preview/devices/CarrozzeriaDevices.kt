package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * carrozzeria device specifications for Android Compose previews.
 *
 * This extension provides carrozzeria device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Carrozzeria.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Carrozzeria: Any
  get() = object {
      /** DeviceSpec(manufacturer=carrozzeria, code=SDA_700TAB, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=carrozzeria, code=SDA_700TAB,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SDA_700TAB = "spec:width=800,height=1280,unit=px,dpi=213"

  }
