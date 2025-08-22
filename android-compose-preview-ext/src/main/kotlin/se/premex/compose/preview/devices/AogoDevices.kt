package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AoGo device specifications for Android Compose previews.
 *
 * This extension provides AoGo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aogo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aogo: Any
  get() = object {
      /** AoGo AoGo1 */
      val AOGO1 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
