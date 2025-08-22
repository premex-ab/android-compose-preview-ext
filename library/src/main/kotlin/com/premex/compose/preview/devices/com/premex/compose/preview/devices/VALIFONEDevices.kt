package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VALIFONE device specifications for Android Compose previews.
 *
 * This extension provides VALIFONE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VALIFONE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VALIFONE: Any
  get() = object {
      /** DeviceSpec(manufacturer=VALIFONE, code=V200, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VALIFONE, code=V200, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V200 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VALIFONE, code=V710, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VALIFONE, code=V710, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V710 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VALIFONE, code=V730, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VALIFONE, code=V730, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V730 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VALIFONE, code=W888, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VALIFONE, code=W888, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val W888 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
