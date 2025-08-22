package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Telia device specifications for Android Compose previews.
 *
 * This extension provides Telia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Telia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Telia: Any
  get() = object {
      /** Telia DV8919X-KET */
      val DV8919X_KET = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Telia DV8919-KLT */
      val DV8919_KLT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Telia DV8919-KST */
      val DV8919_KST = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
