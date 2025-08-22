package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YUHO device specifications for Android Compose previews.
 *
 * This extension provides YUHO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YUHO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YUHO: Any
  get() = object {
      /** DeviceSpec(manufacturer=YUHO, code=A1332E, width=480, height=1014, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YUHO, code=A1332E, width=480,
      height=1014, dpi=200, isGoogleDevice=false).code */
      val A1332E = "spec:width=480,height=1014,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=YUHO, code=Netra, width=720, height=1560, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YUHO, code=Netra, width=720,
      height=1560, dpi=240, isGoogleDevice=false).code */
      val NETRA = "spec:width=720,height=1560,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=YUHO, code=YUHO_Y1_StarS, width=412, height=502, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YUHO, code=YUHO_Y1_StarS,
      width=412, height=502, dpi=180, isGoogleDevice=false).code */
      val YUHO_Y1_STARS = "spec:width=412,height=502,unit=px,dpi=180"

  }
