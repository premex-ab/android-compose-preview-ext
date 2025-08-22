package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Punos device specifications for Android Compose previews.
 *
 * This extension provides Punos device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Punos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Punos: Any
  get() = object {
      /** Punos PTXR1024B */
      val PTXR1024B = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Punos PTXR824B */
      val PTXR824B = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Punos Punos_10 */
      val PUNOS_10 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
