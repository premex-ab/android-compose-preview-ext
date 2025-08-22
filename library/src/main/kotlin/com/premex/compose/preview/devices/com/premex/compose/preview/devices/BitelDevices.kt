package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Bitel device specifications for Android Compose previews.
 *
 * This extension provides Bitel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bitel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bitel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Bitel, code=B8416, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bitel, code=B8416, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val B8416 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bitel, code=B8506, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bitel, code=B8506, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val B8506 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bitel, code=B9504, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bitel, code=B9504, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val B9504 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bitel, code=BPRO, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bitel, code=BPRO, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BPRO = "spec:width=720,height=1280,unit=px,dpi=320"

  }
