package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SIMI device specifications for Android Compose previews.
 *
 * This extension provides SIMI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SIMI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SIMI: Any
  get() = object {
      /** DeviceSpec(manufacturer=SIMI, code=Mecha, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SIMI, code=Mecha, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val MECHA = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SIMI, code=S501plus-Z, width=540, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SIMI, code=S501plus-Z, width=540,
      height=960, dpi=220, isGoogleDevice=false).code */
      val S501PLUS_Z = "spec:width=540,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=SIMI, code=S502, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SIMI, code=S502, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S502 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SIMI, code=S507, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SIMI, code=S507, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S507 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SIMI, code=S630, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SIMI, code=S630, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val S630 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SIMI, code=S8001, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SIMI, code=S8001, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val S8001 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
