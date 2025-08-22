package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * POLAROID device specifications for Android Compose previews.
 *
 * This extension provides POLAROID device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Polaroid.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Polaroid: Any
  get() = object {
      /** POLAROID BDL424 */
      val BDL424 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** POLAROID GMP */
      val GMP = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** POLAROID MID4G64PR002 */
      val MID4G64PR002 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** POLAROID MIDS2410PR001 */
      val MIDS2410PR001 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** POLAROID R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** POLAROID R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** POLAROID redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

  }
