package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Parrot_Mobile device specifications for Android Compose previews.
 *
 * This extension provides Parrot_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ParrotMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ParrotMobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=Parrot_Mobile, code=Prestige, width=720, height=1440, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Parrot_Mobile, code=Prestige,
      width=720, height=1440, dpi=360, isGoogleDevice=false).code */
      val PRESTIGE = "spec:width=720,height=1440,unit=px,dpi=360"

  }
