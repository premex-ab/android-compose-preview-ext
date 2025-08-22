package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Orbic device specifications for Android Compose previews.
 *
 * This extension provides Orbic device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Orbic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Orbic: Any
  get() = object {
      /** Orbic JOY2 */
      val JOY2 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Orbic R678EL */
      val R678EL = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Orbic R678L5 */
      val R678L5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Orbic R8L5T */
      val R8L5T = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Orbic RC545L */
      val RC545L = "spec:width=480,height=960,unit=px,dpi=240"

      /** Orbic RC555L */
      val RC555L = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Orbic RC608L */
      val RC608L = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Orbic RC609L */
      val RC609L = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Orbic RC609LP */
      val RC609LP = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Orbic RC609LSM */
      val RC609LSM = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Orbic RC8L1T-RW */
      val RC8L1T_RW = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Orbic VC_Device */
      val VC_DEVICE = "spec:width=800,height=1280,unit=px,dpi=240"

  }
