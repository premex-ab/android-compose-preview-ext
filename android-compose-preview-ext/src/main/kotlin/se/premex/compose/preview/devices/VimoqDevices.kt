package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VIMOQ device specifications for Android Compose previews.
 *
 * This extension provides VIMOQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vimoq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vimoq: Any
  get() = object {
      /** VIMOQ VIMOQ-A631LO */
      val VIMOQ_A631LO = "spec:width=480,height=1014,unit=px,dpi=200"

      /** VIMOQ VIMOQ-P662LO */
      val VIMOQ_P662LO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** VIMOQ VIMOQ-S661LS */
      val VIMOQ_S661LS = "spec:width=720,height=1612,unit=px,dpi=320"

  }
