package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * G_TOUCH device specifications for Android Compose previews.
 *
 * This extension provides G_TOUCH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GTOUCH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GTOUCH: Any
  get() = object {
      /** DeviceSpec(manufacturer=G_TOUCH, code=Stella_Omega, width=1080, height=2220, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G_TOUCH, code=Stella_Omega,
      width=1080, height=2220, dpi=440, isGoogleDevice=false).code */
      val STELLA_OMEGA = "spec:width=1080,height=2220,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=G_TOUCH, code=Stella_Omega_Plus, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G_TOUCH, code=Stella_Omega_Plus,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val STELLA_OMEGA_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=G_TOUCH, code=Stella_XS, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G_TOUCH, code=Stella_XS, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val STELLA_XS = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=G_TOUCH, code=Stella_X_Plus, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G_TOUCH, code=Stella_X_Plus,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val STELLA_X_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

  }
