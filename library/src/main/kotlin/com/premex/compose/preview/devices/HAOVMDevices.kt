package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HAOVM device specifications for Android Compose previews.
 *
 * This extension provides HAOVM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HAOVM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HAOVM: Any
  get() = object {
      /** HAOVM HP10 */
      val HP10 = "spec:width=800,height=1280,unit=px,dpi=186"

      /** HAOVM HP10_EEA */
      val HP10_EEA = "spec:width=800,height=1280,unit=px,dpi=186"

      /** HAOVM HP20 */
      val HP20 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** HAOVM P10_2024 */
      val P10_2024 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HAOVM P10_Pro */
      val P10_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HAOVM P20 */
      val P20 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** HAOVM P9 */
      val P9 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HAOVM P9_EEA */
      val P9_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HAOVM PS30 */
      val PS30 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** HAOVM T2000 */
      val T2000 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
