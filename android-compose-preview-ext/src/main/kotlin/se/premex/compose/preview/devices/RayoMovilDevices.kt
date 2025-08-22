package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * RAYO_MOVIl device specifications for Android Compose previews.
 *
 * This extension provides RAYO_MOVIl device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RayoMovil.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RayoMovil: Any
  get() = object {
      /** RAYO_MOVIl Atlas */
      val ATLAS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** RAYO_MOVIl ATLAS_2 */
      val ATLAS_2 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** RAYO_MOVIl RAYO_X1 */
      val RAYO_X1 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
