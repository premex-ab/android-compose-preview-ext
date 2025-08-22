package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cellecor device specifications for Android Compose previews.
 *
 * This extension provides Cellecor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cellecor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cellecor: Any
  get() = object {
      /** DeviceSpec(manufacturer=Cellecor, code=S2, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cellecor, code=S2, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Cellecor, code=S3pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cellecor, code=S3pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S3PRO = "spec:width=720,height=1600,unit=px,dpi=320"

  }
