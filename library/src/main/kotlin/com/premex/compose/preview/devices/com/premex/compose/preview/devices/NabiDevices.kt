package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * nabi device specifications for Android Compose previews.
 *
 * This extension provides nabi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nabi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nabi: Any
  get() = object {
      /** DeviceSpec(manufacturer=nabi, code=DMTAB-NV20A, width=900, height=1600, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nabi, code=DMTAB-NV20A, width=900,
      height=1600, dpi=213, isGoogleDevice=false).code */
      val DMTAB_NV20A = "spec:width=900,height=1600,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=nabi, code=DMTAB-NV24A, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nabi, code=DMTAB-NV24A, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val DMTAB_NV24A = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=nabi, code=mt799, width=552, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nabi, code=mt799, width=552,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MT799 = "spec:width=552,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=nabi, code=nabi2S, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nabi, code=nabi2S, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NABI2S = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=nabi, code=NBFP07PMKG, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nabi, code=NBFP07PMKG, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val NBFP07PMKG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=nabi, code=NBTY07SMKG, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nabi, code=NBTY07SMKG, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val NBTY07SMKG = "spec:width=600,height=1024,unit=px,dpi=160"

  }
