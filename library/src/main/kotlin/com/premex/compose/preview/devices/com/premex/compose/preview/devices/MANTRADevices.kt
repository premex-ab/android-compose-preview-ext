package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MANTRA device specifications for Android Compose previews.
 *
 * This extension provides MANTRA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MANTRA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MANTRA: Any
  get() = object {
      /** DeviceSpec(manufacturer=MANTRA, code=MFSTAB, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MANTRA, code=MFSTAB, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MFSTAB = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MANTRA, code=MFSTABII, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MANTRA, code=MFSTABII, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MFSTABII = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MANTRA, code=MFSTABIV, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MANTRA, code=MFSTABIV, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MFSTABIV = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MANTRA, code=MFSTAB_74G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MANTRA, code=MFSTAB_74G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MFSTAB_74G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MANTRA, code=MOXA7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MANTRA, code=MOXA7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MOXA7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MANTRA, code=MOXA71, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MANTRA, code=MOXA71, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MOXA71 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
