package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TM_CELL device specifications for Android Compose previews.
 *
 * This extension provides TM_CELL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TmCell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TmCell: Any
  get() = object {
      /** TM_CELL LOGIC_X60_PLUS */
      val LOGIC_X60_PLUS = "spec:width=600,height=1280,unit=px,dpi=240"

      /** TM_CELL UNONU_W60_PLUS */
      val UNONU_W60_PLUS = "spec:width=600,height=1280,unit=px,dpi=240"

  }
