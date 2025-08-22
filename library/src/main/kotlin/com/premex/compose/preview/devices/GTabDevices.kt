package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * G-Tab device specifications for Android Compose previews.
 *
 * This extension provides G-Tab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GTab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GTab: Any
  get() = object {
      /** G-Tab C10X */
      val C10X = "spec:width=800,height=1280,unit=px,dpi=213"

      /** G-Tab C10_1 */
      val C10_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** G-Tab C10_2 */
      val C10_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** G-Tab C10-pro */
      val C10_PRO = "spec:width=800,height=1280,unit=px,dpi=186"

      /** G-Tab C20 */
      val C20 = "spec:width=800,height=1280,unit=px,dpi=170"

      /** G-Tab C3 */
      val C3 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** G-Tab C30 */
      val C30 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** G-Tab C9 */
      val C9 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** G-Tab F1 */
      val F1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** G-Tab F1_1 */
      val F1_1 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** G-Tab F2 */
      val F2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** G-Tab F2X */
      val F2X = "spec:width=600,height=1024,unit=px,dpi=213"

      /** G-Tab F4 */
      val F4 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** G-Tab F8 */
      val F8 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** G-Tab F8X */
      val F8X = "spec:width=800,height=1280,unit=px,dpi=213"

      /** G-Tab F8_1 */
      val F8_1 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** G-Tab G9 */
      val G9 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** G-Tab N271 */
      val N271 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** G-Tab N28 */
      val N28 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** G-Tab N281 */
      val N281 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** G-Tab P2000 */
      val P2000 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** G-Tab P733 */
      val P733 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** G-Tab PAD10 */
      val PAD10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** G-Tab PAD10_PRO */
      val PAD10_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** G-Tab Q2 */
      val Q2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** G-Tab Q2S */
      val Q2S = "spec:width=600,height=1024,unit=px,dpi=160"

      /** G-Tab Q3 */
      val Q3 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** G-Tab Q4 */
      val Q4 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** G-Tab Q6 */
      val Q6 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** G-Tab S10 */
      val S10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** G-Tab S12 */
      val S12 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** G-Tab S20 */
      val S20 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** G-Tab S30 */
      val S30 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** G-Tab S30_1 */
      val S30_1 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** G-Tab S40 */
      val S40 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** G-Tab S40-1 */
      val S40_1 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** G-Tab S50 */
      val S50 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** G-Tab S50-pro */
      val S50_PRO = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** G-Tab S8 */
      val S8 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** G-Tab S8K_1 */
      val S8K_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** G-Tab S8K_2 */
      val S8K_2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** G-Tab S8X */
      val S8X = "spec:width=800,height=1280,unit=px,dpi=240"

      /** G-Tab T10_1 */
      val T10_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** G-Tab T11_1 */
      val T11_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** G-Tab T11_PRO */
      val T11_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** G-Tab T8S_1 */
      val T8S_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** G-Tab T8_1 */
      val T8_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** G-Tab T9_1 */
      val T9_1 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
