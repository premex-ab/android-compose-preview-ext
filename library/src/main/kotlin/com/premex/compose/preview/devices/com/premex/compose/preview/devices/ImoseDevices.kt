package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Imose device specifications for Android Compose previews.
 *
 * This extension provides Imose device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Imose.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Imose: Any
  get() = object {
      /** DeviceSpec(manufacturer=Imose, code=BAM_III, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Imose, code=BAM_III, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BAM_III = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Imose, code=Omotab2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Imose, code=Omotab2, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val OMOTAB2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Imose, code=Omotab_2s, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Imose, code=Omotab_2s, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val OMOTAB_2S = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Imose, code=SEMPE, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Imose, code=SEMPE, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SEMPE = "spec:width=720,height=1600,unit=px,dpi=320"

  }
