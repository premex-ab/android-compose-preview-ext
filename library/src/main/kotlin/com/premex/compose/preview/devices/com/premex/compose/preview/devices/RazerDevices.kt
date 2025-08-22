package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * razer device specifications for Android Compose previews.
 *
 * This extension provides razer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Razer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Razer: Any
  get() = object {
      /** DeviceSpec(manufacturer=razer, code=aura, width=1440, height=2560, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=razer, code=aura, width=1440,
      height=2560, dpi=480, isGoogleDevice=false).code */
      val AURA = "spec:width=1440,height=2560,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=razer, code=bolt, width=1440, height=2560, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=razer, code=bolt, width=1440,
      height=2560, dpi=480, isGoogleDevice=false).code */
      val BOLT = "spec:width=1440,height=2560,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=razer, code=cheryl, width=1440, height=2560, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=razer, code=cheryl, width=1440,
      height=2560, dpi=480, isGoogleDevice=false).code */
      val CHERYL = "spec:width=1440,height=2560,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=razer, code=cheryl_ckh, width=1440, height=2560, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=razer, code=cheryl_ckh, width=1440,
      height=2560, dpi=480, isGoogleDevice=false).code */
      val CHERYL_CKH = "spec:width=1440,height=2560,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=razer, code=linus, width=1440, height=2560, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=razer, code=linus, width=1440,
      height=2560, dpi=480, isGoogleDevice=false).code */
      val LINUS = "spec:width=1440,height=2560,unit=px,dpi=480"

  }
