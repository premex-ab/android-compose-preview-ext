package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * S_TELL device specifications for Android Compose previews.
 *
 * This extension provides S_TELL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.STELL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.STELL: Any
  get() = object {
      /** DeviceSpec(manufacturer=S_TELL, code=M630, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=S_TELL, code=M630, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val M630 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=S_TELL, code=P760, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=S_TELL, code=P760, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P760 = "spec:width=640,height=1280,unit=px,dpi=320"

  }
