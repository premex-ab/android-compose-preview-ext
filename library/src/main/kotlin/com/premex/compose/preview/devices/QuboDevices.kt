package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Qubo device specifications for Android Compose previews.
 *
 * This extension provides Qubo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Qubo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Qubo: Any
  get() = object {
      /** Qubo BIG1 */
      val BIG1 = "spec:width=480,height=1014,unit=px,dpi=213"

      /** Qubo P19 */
      val P19 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** Qubo SP510 */
      val SP510 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Qubo T104_64GB */
      val T104_64GB = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Qubo T10_32GB */
      val T10_32GB = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Qubo T3G_Q07 */
      val T3G_Q07 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** Qubo TKIDS_100_EEA */
      val TKIDS_100_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Qubo X626 */
      val X626 = "spec:width=480,height=1014,unit=px,dpi=213"

      /** Qubo X626_4G */
      val X626_4G = "spec:width=480,height=1014,unit=px,dpi=213"

      /** Qubo X668_32GB */
      val X668_32GB = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Qubo X668_64GB */
      val X668_64GB = "spec:width=720,height=1600,unit=px,dpi=320"

  }
