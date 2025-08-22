package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ADO device specifications for Android Compose previews.
 *
 * This extension provides ADO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ADO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ADO: Any
  get() = object {
      /** DeviceSpec(manufacturer=ADO, code=DIW377_ALT_DO, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADO, code=DIW377_ALT_DO,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DIW377_ALT_DO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
