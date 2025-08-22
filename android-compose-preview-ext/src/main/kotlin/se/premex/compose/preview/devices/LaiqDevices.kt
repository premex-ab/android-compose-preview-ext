package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * LAIQ device specifications for Android Compose previews.
 *
 * This extension provides LAIQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Laiq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Laiq: Any
  get() = object {
      /** LAIQ LAIQ_Glam */
      val LAIQ_GLAM = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LAIQ STARTRAIL */
      val STARTRAIL = "spec:width=720,height=1280,unit=px,dpi=320"

  }
