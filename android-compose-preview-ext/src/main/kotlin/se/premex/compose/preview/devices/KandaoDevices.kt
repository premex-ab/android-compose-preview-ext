package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * KanDao device specifications for Android Compose previews.
 *
 * This extension provides KanDao device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kandao.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kandao: Any
  get() = object {
      /** KanDao MT1001 */
      val MT1001 = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
