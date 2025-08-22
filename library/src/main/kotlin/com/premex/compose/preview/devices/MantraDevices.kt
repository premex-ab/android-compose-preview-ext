package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MANTRA device specifications for Android Compose previews.
 *
 * This extension provides MANTRA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mantra.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mantra: Any
  get() = object {
      /** MANTRA MFSTAB */
      val MFSTAB = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MANTRA MFSTABII */
      val MFSTABII = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MANTRA MFSTABIV */
      val MFSTABIV = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MANTRA MFSTAB_74G */
      val MFSTAB_74G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MANTRA MOXA7 */
      val MOXA7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MANTRA MOXA71 */
      val MOXA71 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
