package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * uniqcell device specifications for Android Compose previews.
 *
 * This extension provides uniqcell device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Uniqcell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Uniqcell: Any
  get() = object {
      /** uniqcell UNI_GO */
      val UNI_GO = "spec:width=720,height=1600,unit=px,dpi=320"

  }
