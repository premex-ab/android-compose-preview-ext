package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HuoSheng device specifications for Android Compose previews.
 *
 * This extension provides HuoSheng device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Huosheng.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Huosheng: Any
  get() = object {
      /** HuoSheng HMS-PD-X1C-3 */
      val HMS_PD_X1C_3 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
