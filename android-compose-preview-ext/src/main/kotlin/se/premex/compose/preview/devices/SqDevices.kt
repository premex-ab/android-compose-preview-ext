package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SQ device specifications for Android Compose previews.
 *
 * This extension provides SQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sq: Any
  get() = object {
      /** SQ Hope10_Max */
      val HOPE10_MAX = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SQ Hope8_Max */
      val HOPE8_MAX = "spec:width=800,height=1280,unit=px,dpi=204"

  }
