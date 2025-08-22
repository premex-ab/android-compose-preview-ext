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
      /** nabi DMTAB-NV20A */
      val DMTAB_NV20A = "spec:width=900,height=1600,unit=px,dpi=213"

      /** nabi DMTAB-NV24A */
      val DMTAB_NV24A = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** nabi mt799 */
      val MT799 = "spec:width=552,height=1024,unit=px,dpi=160"

      /** nabi nabi2S */
      val NABI2S = "spec:width=800,height=1280,unit=px,dpi=213"

      /** nabi NBFP07PMKG */
      val NBFP07PMKG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** nabi NBTY07SMKG */
      val NBTY07SMKG = "spec:width=600,height=1024,unit=px,dpi=160"

  }
