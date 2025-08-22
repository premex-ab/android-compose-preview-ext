package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * imiia device specifications for Android Compose previews.
 *
 * This extension provides imiia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Imiia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Imiia: Any
  get() = object {
      /** imiia IAD */
      val IAD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** imiia keoneae */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** imiia mateo */
      val MATEO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** imiia pioneer */
      val PIONEER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** imiia YUL */
      val YUL = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
