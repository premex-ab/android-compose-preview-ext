package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HOPE device specifications for Android Compose previews.
 *
 * This extension provides HOPE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hope.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hope: Any
  get() = object {
      /** HOPE HOPE_S25u */
      val HOPE_S25U = "spec:width=720,height=1600,unit=px,dpi=320"

  }
