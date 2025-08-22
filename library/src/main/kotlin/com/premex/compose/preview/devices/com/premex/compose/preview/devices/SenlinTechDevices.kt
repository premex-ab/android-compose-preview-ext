package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SenlinTech device specifications for Android Compose previews.
 *
 * This extension provides SenlinTech device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SenlinTech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SenlinTech: Any
  get() = object {
      /** DeviceSpec(manufacturer=SenlinTech, code=pad6_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SenlinTech, code=pad6_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val PAD6_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SenlinTech, code=S30-Pro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SenlinTech, code=S30-Pro,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val S30_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

  }
