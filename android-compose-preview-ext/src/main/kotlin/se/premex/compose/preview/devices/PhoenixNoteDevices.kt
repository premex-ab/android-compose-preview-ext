package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Phoenix_Note device specifications for Android Compose previews.
 *
 * This extension provides Phoenix_Note device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PhoenixNote.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PhoenixNote: Any
  get() = object {
      /** Phoenix_Note PPS2022-P156 */
      val PPS2022_P156 = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
