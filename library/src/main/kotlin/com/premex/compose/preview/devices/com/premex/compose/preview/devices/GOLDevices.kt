package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GOL device specifications for Android Compose previews.
 *
 * This extension provides GOL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GOL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GOL: Any
  get() = object {
      /** DeviceSpec(manufacturer=GOL, code=F10, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOL, code=F10, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val F10 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=GOL, code=F10_PRIME, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOL, code=F10_PRIME, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val F10_PRIME = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=GOL, code=F11, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOL, code=F11, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val F11 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=GOL, code=F9, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOL, code=F9, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val F9 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=GOL, code=F9prime, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOL, code=F9prime, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val F9PRIME = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=GOL, code=Team_7_Plus, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOL, code=Team_7_Plus, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TEAM_7_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

  }
