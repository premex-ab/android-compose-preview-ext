package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AX_META device specifications for Android Compose previews.
 *
 * This extension provides AX_META device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AxMeta.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AxMeta: Any
  get() = object {
      /** AX_META AX_META_Tab_7 */
      val AX_META_TAB_7 = "spec:width=600,height=1024,unit=px,dpi=180"

  }
