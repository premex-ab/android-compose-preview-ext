package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Frunsi device specifications for Android Compose previews.
 *
 * This extension provides Frunsi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Frunsi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Frunsi: Any
  get() = object {
      /** DeviceSpec(manufacturer=Frunsi, code=RubensTab_T11, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Frunsi, code=RubensTab_T11,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val RUBENSTAB_T11 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Frunsi, code=RubensTab_T8, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Frunsi, code=RubensTab_T8,
      width=800, height=1280, dpi=180, isGoogleDevice=false).code */
      val RUBENSTAB_T8 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Frunsi, code=T11Pro, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Frunsi, code=T11Pro, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val T11PRO = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
