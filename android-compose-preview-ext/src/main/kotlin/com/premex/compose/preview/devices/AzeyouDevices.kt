package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Azeyou device specifications for Android Compose previews.
 *
 * This extension provides Azeyou device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Azeyou.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Azeyou: Any
  get() = object {
      /** Azeyou AT1002J */
      val AT1002J = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Azeyou AT1011E */
      val AT1011E = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Azeyou AT1011U */
      val AT1011U = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Azeyou AT1012E */
      val AT1012E = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Azeyou AT1012U */
      val AT1012U = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Azeyou AT1014 */
      val AT1014 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Azeyou AT1014U */
      val AT1014U = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Azeyou AT1016BBK */
      val AT1016BBK = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Azeyou AT1016E */
      val AT1016E = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Azeyou AT1016U */
      val AT1016U = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Azeyou AT1101 */
      val AT1101 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Azeyou AT1202J */
      val AT1202J = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Azeyou M17QF27A */
      val M17QF27A = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
