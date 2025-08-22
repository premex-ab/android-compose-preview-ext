package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * LEADER device specifications for Android Compose previews.
 *
 * This extension provides LEADER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Leader.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Leader: Any
  get() = object {
      /** LEADER kenton */
      val KENTON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** LEADER lasalle */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

  }
