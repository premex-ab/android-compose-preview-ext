package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Atozee device specifications for Android Compose previews.
 *
 * This extension provides Atozee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Atozee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Atozee: Any
  get() = object {
      /** Atozee AT70K */
      val AT70K = "spec:width=600,height=1024,unit=px,dpi=160"

  }
