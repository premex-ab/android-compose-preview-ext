package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DNA device specifications for Android Compose previews.
 *
 * This extension provides DNA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DNA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DNA: Any
  get() = object {
      /** DNA dctiw384 */
      val DCTIW384 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DNA m393gena */
      val M393GENA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DNA m393vsb_dna */
      val M393VSB_DNA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
