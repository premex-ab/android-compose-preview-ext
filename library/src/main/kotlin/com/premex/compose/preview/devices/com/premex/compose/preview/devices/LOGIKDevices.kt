package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LOGIK device specifications for Android Compose previews.
 *
 * This extension provides LOGIK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LOGIK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LOGIK: Any
  get() = object {
      /** DeviceSpec(manufacturer=LOGIK, code=sadang, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIK, code=sadang, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SADANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LOGIK, code=tabata, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIK, code=tabata, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TABATA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
