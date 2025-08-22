package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MASTER-G device specifications for Android Compose previews.
 *
 * This extension provides MASTER-G device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MASTERG.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MASTERG: Any
  get() = object {
      /** MASTER-G hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MASTER-G lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MASTER-G martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MASTER-G mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MASTER-G patrick */
      val PATRICK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MASTER-G R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MASTER-G R10G */
      val R10G = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** MASTER-G R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MASTER-G R3_GTV */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MASTER-G R4_GTV */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
