package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SOHO_STYLE device specifications for Android Compose previews.
 *
 * This extension provides SOHO_STYLE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SOHOSTYLE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SOHOSTYLE: Any
  get() = object {
      /** DeviceSpec(manufacturer=SOHO_STYLE, code=S1582C, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SOHO_STYLE, code=S1582C, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val S1582C = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SOHO_STYLE, code=S1586K, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SOHO_STYLE, code=S1586K, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S1586K = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SOHO_STYLE, code=S65, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SOHO_STYLE, code=S65, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SOHO_STYLE, code=S6561, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SOHO_STYLE, code=S6561, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val S6561 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SOHO_STYLE, code=SS5114G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SOHO_STYLE, code=SS5114G,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val SS5114G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SOHO_STYLE, code=SS5314G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SOHO_STYLE, code=SS5314G,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val SS5314G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SOHO_STYLE, code=SS5424G, width=480, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SOHO_STYLE, code=SS5424G,
      width=480, height=960, dpi=220, isGoogleDevice=false).code */
      val SS5424G = "spec:width=480,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=SOHO_STYLE, code=SS5514G, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SOHO_STYLE, code=SS5514G,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val SS5514G = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SOHO_STYLE, code=SS5539G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SOHO_STYLE, code=SS5539G,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val SS5539G = "spec:width=480,height=960,unit=px,dpi=240"

  }
