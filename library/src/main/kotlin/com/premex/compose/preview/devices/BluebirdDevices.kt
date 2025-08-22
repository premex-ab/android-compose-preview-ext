package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Bluebird device specifications for Android Compose previews.
 *
 * This extension provides Bluebird device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bluebird.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bluebird: Any
  get() = object {
      /** Bluebird BM180 */
      val BM180 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Bluebird CF550 */
      val CF550 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Bluebird EF400 */
      val EF400 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Bluebird EF401 */
      val EF401 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Bluebird EF500 */
      val EF500 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Bluebird EF501 */
      val EF501 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Bluebird EF550 */
      val EF550 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Bluebird EF550R */
      val EF550R = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Bluebird EF551 */
      val EF551 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Bluebird HF550 */
      val HF550 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Bluebird RP350 */
      val RP350 = "spec:width=320,height=480,unit=px,dpi=150"

      /** Bluebird RT080 */
      val RT080 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Bluebird RT103 */
      val RT103 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Bluebird S20 */
      val S20 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Bluebird SF550 */
      val SF550 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Bluebird SF650 */
      val SF650 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Bluebird ST103 */
      val ST103 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Bluebird VF550 */
      val VF550 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Bluebird VX500 */
      val VX500 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
