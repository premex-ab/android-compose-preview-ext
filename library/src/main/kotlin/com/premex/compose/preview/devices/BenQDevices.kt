package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BenQ device specifications for Android Compose previews.
 *
 * This extension provides BenQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BenQ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BenQ: Any
  get() = object {
      /** BenQ himalaya */
      val HIMALAYA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BenQ ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BenQ longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BenQ RE04N_series */
      val RE04N_SERIES = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** BenQ RE04_series */
      val RE04_SERIES = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** BenQ redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BenQ RM6504 */
      val RM6504 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** BenQ RM7504 */
      val RM7504 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** BenQ RM8604 */
      val RM8604 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** BenQ RP6504 */
      val RP6504 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** BenQ RP7504 */
      val RP7504 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** BenQ RP8604 */
      val RP8604 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** BenQ S905Y2 */
      val S905Y2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BenQ samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BenQ YUL */
      val YUL = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
