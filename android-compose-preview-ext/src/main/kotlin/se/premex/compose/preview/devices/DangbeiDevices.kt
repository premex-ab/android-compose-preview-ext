package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Dangbei device specifications for Android Compose previews.
 *
 * This extension provides Dangbei device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dangbei.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dangbei: Any
  get() = object {
      /** Dangbei himalaya */
      val HIMALAYA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Dangbei khandala */
      val KHANDALA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
