package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * M4TEL device specifications for Android Compose previews.
 *
 * This extension provides M4TEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.M4TEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.M4TEL: Any
  get() = object {
      /** DeviceSpec(manufacturer=M4TEL, code=DREAMPLUS02A-S10A, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=M4TEL, code=DREAMPLUS02A-S10A,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val DREAMPLUS02A_S10A = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=M4TEL, code=DREAMPLUS03A-S14A, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=M4TEL, code=DREAMPLUS03A-S14A,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val DREAMPLUS03A_S14A = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=M4TEL, code=NOVA03A_S22A, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=M4TEL, code=NOVA03A_S22A,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val NOVA03A_S22A = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=M4TEL, code=R2, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=M4TEL, code=R2, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val R2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=M4TEL, code=R2_Plus, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=M4TEL, code=R2_Plus, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val R2_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

  }
