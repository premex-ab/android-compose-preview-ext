package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MOBICEL device specifications for Android Compose previews.
 *
 * This extension provides MOBICEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobicel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobicel: Any
  get() = object {
      /** MOBICEL COSMO */
      val COSMO = "spec:width=600,height=1024,unit=px,dpi=213"

      /** MOBICEL ECHO */
      val ECHO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MOBICEL FEVER */
      val FEVER = "spec:width=600,height=1024,unit=px,dpi=213"

  }
