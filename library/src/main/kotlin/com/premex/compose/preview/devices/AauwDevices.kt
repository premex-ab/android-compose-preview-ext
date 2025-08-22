package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AAUW device specifications for Android Compose previews.
 *
 * This extension provides AAUW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aauw.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aauw: Any
  get() = object {
      /** AAUW M50 */
      val M50 = "spec:width=1200,height=2000,unit=px,dpi=260"

      /** AAUW M50_NEW */
      val M50_NEW = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** AAUW M60_NEW */
      val M60_NEW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** AAUW T10 */
      val T10 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** AAUW T50_2023 */
      val T50_2023 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** AAUW T60Pro */
      val T60PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** AAUW T60Pro_2023 */
      val T60PRO_2023 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** AAUW T60PRO_ROW */
      val T60PRO_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** AAUW T90 */
      val T90 = "spec:width=1200,height=1920,unit=px,dpi=272"

      /** AAUW T_50 */
      val T_50 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
