package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Packard_Bell device specifications for Android Compose previews.
 *
 * This extension provides Packard_Bell device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PackardBell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PackardBell: Any
  get() = object {
      /** Packard_Bell DAYTONA-G12 */
      val DAYTONA_G12 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Packard_Bell DAYTONA-G6 */
      val DAYTONA_G6 = "spec:width=480,height=960,unit=px,dpi=220"

      /** Packard_Bell INTERLAGOS-T32 */
      val INTERLAGOS_T32 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Packard_Bell M10905-32 */
      val M10905_32 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Packard_Bell MONZA-T5 */
      val MONZA_T5 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Packard_Bell SILVERSTONE-T10 */
      val SILVERSTONE_T10 = "spec:width=1200,height=1920,unit=px,dpi=200"

      /** Packard_Bell Silverstone-T10X */
      val SILVERSTONE_T10X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Packard_Bell SILVERSTONE-T11 */
      val SILVERSTONE_T11 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Packard_Bell SILVERSTONE-T18 */
      val SILVERSTONE_T18 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Packard_Bell TARGA-F10PRO */
      val TARGA_F10PRO = "spec:width=800,height=1280,unit=px,dpi=213"

  }
