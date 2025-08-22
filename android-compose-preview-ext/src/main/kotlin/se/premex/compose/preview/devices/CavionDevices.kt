package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CAVION device specifications for Android Compose previews.
 *
 * This extension provides CAVION device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cavion.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cavion: Any
  get() = object {
      /** CAVION M1092Q */
      val M1092Q = "spec:width=800,height=1280,unit=px,dpi=160"

  }
